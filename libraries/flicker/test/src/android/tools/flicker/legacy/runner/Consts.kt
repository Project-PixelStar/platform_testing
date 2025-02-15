/*
 * Copyright (C) 2024 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.tools.flicker.legacy.runner

import org.junit.runner.Description

object Consts {
    internal const val FAILURE = "Expected failure"
    internal const val SETUP = "Setup"
    internal const val TEARDOWN = "Teardown"
    internal const val TRANSITION = "Transition"

    internal fun description(obj: Any) = Description.createTestDescription(obj::class.java, "test")
}
