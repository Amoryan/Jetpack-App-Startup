package com.ppdai.code.jetpack.startup

import android.content.Context
import android.util.Log

/**
 * @author sunshine big boy
 *
 * <pre>
 *      talk is cheap, show me the code
 * </pre>
 */
class LibraryC private constructor(private val context: Context) {

    companion object {

        lateinit var instance: LibraryC

        @JvmStatic
        fun getInstance(context: Context): LibraryC {
            if (!this::instance.isInitialized) {
                instance = LibraryC(context)
            }
            Log.d("adai", "LibraryC")
            return instance
        }

    }

    fun test() {
        Log.d("adai", "LibraryC.test()")
    }

}