package imam.s18090039.penjualan.activity.penjualan.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import imam.s18090039.penjualan.model.Keranjang

@Generated("com.robohorse.robopojogenerator")
data class ResultKeranjang(

    @field:SerializedName("keranjang")
	val keranjang: List<Keranjang?>? = null,

    @field:SerializedName("message")
	val message: String? = null,

    @field:SerializedName("status")
	val status: Int? = null
)