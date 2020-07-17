package kz.education.stepeducation

import kz.education.stepeducation.domain.ucecase.MaskValidationUseCase
import org.junit.Test

class MaskValidationTest : BaseUnitTest() {

    lateinit var maskValidationUseCase: MaskValidationUseCase

    override fun beforeTest() {
        maskValidationUseCase = MaskValidationUseCase()
    }

    override fun afterTest() {}

    @Test
    fun initiateTest(){
        assert(!maskValidationUseCase.initiateCheckMask("+7 (708) 117-08-3"))
        assert(!maskValidationUseCase.initiateCheckMask("+7 (708) 117-08-3-")) 
        assert(!maskValidationUseCase.initiateCheckMask("+7 (708) 117-08-3yh")) 
        assert(!maskValidationUseCase.initiateCheckMask("+7 (708) 117-08-3#")) 
        assert(!maskValidationUseCase.initiateCheckMask("+7 (708) 117-08-3222"))
        assert(!maskValidationUseCase.initiateCheckMask("7 (708) 117-08-3222"))
        assert(!maskValidationUseCase.initiateCheckMask("7 (770) 811-70-832"))
        assert(!maskValidationUseCase.initiateCheckMask("7 (708) 117-08-32"))
        assert(maskValidationUseCase.initiateCheckMask("+7 (708) 117-08-32"))
    }
}