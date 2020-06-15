package com.ppdai.code.jetpack.startup.initializer

import android.content.Context
import androidx.startup.Initializer
import com.ppdai.code.jetpack.startup.LibraryC

/**
 * @author sunshine big boy
 *
 * <pre>
 *      talk is cheap, show me the code
 * </pre>
 */
class LibraryCInitializer : Initializer<LibraryC> {

    override fun create(context: Context): LibraryC {
        return LibraryC.getInstance(context)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return arrayListOf()
    }

}