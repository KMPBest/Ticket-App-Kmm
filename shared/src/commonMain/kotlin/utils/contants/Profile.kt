package utils.contants

data class ProfileSettingModal(val icon: String, val title: String, val features: Array<String>)


val PROFILE_SETTING = arrayOf(
    ProfileSettingModal("person.xml","Account", arrayOf("Edit Profile", "Change Password")),
    ProfileSettingModal("setting.xml","Settings", arrayOf("Themes", "Permissions")),
    ProfileSettingModal("money.xml","Offers & Referrals", arrayOf("Offers", "Referrals")),
    ProfileSettingModal("about.xml","About", arrayOf("About Movies", "More"))
)