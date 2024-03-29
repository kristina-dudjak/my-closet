package hr.ferit.kristinadudjak.mycloset.data

import android.content.Context
import android.net.Uri
import androidx.core.content.FileProvider
import java.io.File

class ImageProvider : FileProvider() {
    companion object {
        fun getImageUri(context: Context): Uri {
            val directory = File(context.cacheDir, "images")
            directory.mkdirs()
            val file = File.createTempFile(
                "img_",
                null,
                directory,
            )
            val authority = context.packageName + ".provider"
            return getUriForFile(
                context,
                authority,
                file,
            )
        }
    }

}