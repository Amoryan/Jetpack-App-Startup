package com.ppdai.code.jetpack.startup.initializer

import android.content.Context
import androidx.startup.Initializer
import com.ppdai.code.jetpack.startup.LibraryA

/**
 * @author sunshine big boy
 *
 * <pre>
 *      talk is cheap, show me the code
 * </pre>
 */
class LibraryAInitializer : Initializer<LibraryA> {

    override fun create(context: Context): LibraryA {
        return LibraryA.getInstance(context)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return arrayListOf(LibraryCInitializer::class.java)
    }

}