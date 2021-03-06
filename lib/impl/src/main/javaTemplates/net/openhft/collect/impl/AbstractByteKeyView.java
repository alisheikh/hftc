/* with byte|char|short|int|long|float|double|obj key */
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

package net.openhft.collect.impl;

import net.openhft.collect.set.ByteSet;
import javax.annotation.Nonnull;

import java.util.Collection;


public abstract class AbstractByteKeyView/*<>*/ extends AbstractSetView<Byte>
        implements ByteSet/*<>*/, InternalByteCollectionOps/*<>*/ {

    @Override
    public final boolean containsAll(@Nonnull Collection<?> c) {
        return CommonByteCollectionOps.containsAll(this, c);
    }

    /* if !(obj key) */
    @Override
    public final boolean add(byte e) {
        throw new UnsupportedOperationException();
    }

    /* if float|double key */
    @Override
    public final boolean add(/* bits */byte bits) {
        throw new UnsupportedOperationException();
    }
    /* endif */
    /* endif */
}
