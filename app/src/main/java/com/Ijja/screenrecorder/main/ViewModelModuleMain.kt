/**
 * (@rdbrain)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.Ijja.screenrecorder.main

import com.Ijja.screenrecorder.utilcmnuse.Qualifiers.IO_DISPATCHER
import com.Ijja.screenrecorder.utilcmnuse.Qualifiers.MAIN_DISPATCHER
import com.Ijja.screenrecorder.utilcmnuse.prefrencies.PrefNames.PREF_ALWAYS_SHOW_CONTROLS
import com.Ijja.screenrecorder.uiterfacec.mainactivities.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module


val viewModelModule = module {
  viewModel {
    MainViewModel(
        get(named(MAIN_DISPATCHER)),
        get(named(IO_DISPATCHER)),
        get(),
        get(),
        get(),
        get(),
        get(),
        get(),
        get(),
        get(named(PREF_ALWAYS_SHOW_CONTROLS))
    )
  }
}
