package genora.example.com.breader.model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

/**
 * Created by genora-sonia on 16/1/18.
 */

data class Book(
        val book_id: Int,
        val book_name: String,
        @SerializedName("frontcover_path")
        val front_cover_path: String,
        @SerializedName("count_best_seller")
        val best_seller_count: Int,
        val featured: Int,
        val product_key: String,
        val price: String,
        val pdf_path: String,
        val book_img: String,
        @SerializedName("sample_copy_path")
        val sample_pdf_path: String) : Serializable