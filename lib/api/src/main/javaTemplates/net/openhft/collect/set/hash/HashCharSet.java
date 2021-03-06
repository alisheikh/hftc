/* with char|byte|short|int|long|float|double|obj elem */
/*
 * Copyright 2014 the original author or authors.
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

package net.openhft.collect.set.hash;

import net.openhft.collect.hash.HashContainer;
import net.openhft.collect.set.CharSet;


/**
 * An interface for {@code CharSet}s, based on hash tables.
 *
 * @see HashCharSets
 * @see HashCharSetFactory
 */
public interface HashCharSet/*<>*/ extends CharSet/*<>*/, HashContainer {
}
