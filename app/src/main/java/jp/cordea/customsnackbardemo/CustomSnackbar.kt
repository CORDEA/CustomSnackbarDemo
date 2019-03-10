package jp.cordea.customsnackbardemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.BaseTransientBottomBar

class CustomSnackbar constructor(
    parent: ViewGroup,
    content: View
) : BaseTransientBottomBar<CustomSnackbar>(
    parent,
    content,
    object : com.google.android.material.snackbar.ContentViewCallback {
        override fun animateContentOut(p0: Int, p1: Int) {
        }

        override fun animateContentIn(p0: Int, p1: Int) {
        }
    }
) {
    companion object {
        fun make(parent: ViewGroup) =
            CustomSnackbar(
                parent,
                LayoutInflater.from(parent.context).inflate(
                    R.layout.view_custom_snackbar,
                    parent,
                    false
                )
            )
    }

    init {
        view.setBackgroundColor(ContextCompat.getColor(context, android.R.color.transparent))
    }
}
