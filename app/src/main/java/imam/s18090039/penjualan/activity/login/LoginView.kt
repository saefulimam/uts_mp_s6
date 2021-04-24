package imam.s18090039.penjualan.activity.login

import imam.s18090039.penjualan.model.User

interface LoginView {
    fun onSuccessLogin(user: User?)
    fun onErrorLogin(msg: String?)
}