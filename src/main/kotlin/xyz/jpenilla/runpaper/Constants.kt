/*
 * Run Paper Gradle Plugin
 * Copyright (c) 2021 Jason Penilla
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
package xyz.jpenilla.runpaper

internal object Constants {
  const val RUN_PAPER = "RunPaper"

  const val GRADLE_CACHES_DIRECTORY_NAME = "caches"

  object Tasks {
    const val RUN_SERVER = "runServer"
  }

  object Services {
    const val PAPERCLIP = "paperclip"
  }

  object Extensions {
    const val RUN_PAPER = "runPaper"
  }
}
