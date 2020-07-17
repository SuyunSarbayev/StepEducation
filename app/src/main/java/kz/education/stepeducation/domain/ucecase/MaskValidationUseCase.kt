package kz.education.stepeducation.domain.ucecase

class MaskValidationUseCase {

    var PHONE_PATTERN = "[+]{1}[7]{1}[ ]{1}[(]{1}[0-9]{3}[)]{1}[ ]{1}[0-9]{3}[-]{1}[0-9]{2}[-]{1}[0-9]{2}"

//    +7 (XXX) XXX-XX-XX

    fun initiateCheckMask(phone: String) : Boolean{
        return phone.matches(Regex(PHONE_PATTERN))
    }
}