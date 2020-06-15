package com.ppdai.code.jetpack.startup.initializer

import android.content.Context
import androidx.startup.Initializer
import com.ppdai.code.jetpack.startup.LibraryB

/**
 * @author sunshine big boy
 *
 * <pre>
 *      talk is cheap, show me the code
 * </pre>
 */
class LibraryBInitializer : Initializer<LibraryB> {

    override fun create(context: Context): LibraryB {
        return LibraryB.getInstance(context)
    }

    override fun dependencies(): MutableList<Class<out Initializer<*>>> {
        return arrayListOf()
    }

}