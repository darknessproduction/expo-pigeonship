package abi46_0_0.expo.modules.imageloader

import android.content.Context
import abi46_0_0.expo.modules.core.BasePackage
import abi46_0_0.expo.modules.core.interfaces.InternalModule

class ImageLoaderPackage : BasePackage() {
  override fun createInternalModules(context: Context): List<InternalModule> = listOf(ImageLoaderModule(context))
}
