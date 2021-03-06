/* with
 char|byte|short|int|long|float|double|obj key
 short|byte|char|int|long|float|double|obj value
*/
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

package net.openhft.collect.map.hash;

import net.openhft.collect.*;
import net.openhft.collect.hash.*;
import net.openhft.function./*f*/CharShortConsumer/**/;
import net.openhft.collect.map.*;
import javax.annotation.Nullable;

import java.util.Map;


/**
 * An immutable factory of {@code HashCharShortMaps}
 *
 * @see HashCharShortMap
 * @see HashCharShortMaps#getDefaultFactory()
 */
public interface HashCharShortMapFactory/*<>*/ extends CharShortMapFactory/*<>*/
        /* if !(float|double key) */, CharHashFactory<HashCharShortMapFactory/*<>*/>
        /* elif float|double key */, HashContainerFactory<HashCharShortMapFactory/*<>*/>/* endif */ {

    /* define p1 */
    /* if obj key obj value //<K2 extends K, V2 extends V>// elif obj key //<K2 extends K>
    // elif obj value //<V2 extends V>// endif */
    /* enddefine */

    /* define p2 */
    /* if obj key obj value //<K2, V2>// elif obj key //<K2>// elif obj value //<V2>// endif */
    /* enddefine */

    /* define ek */
    /* if obj key //? extends K2// elif !(obj key) //Character// endif */
    /* enddefine */

    /* define ev */
    /* if obj value //? extends V2// elif !(obj value) //Short// endif */
    /* enddefine */

    /* define ep //<// ek //, // ev //>// enddefine */

    /* define pk *//* if !(obj key) //char// elif obj key //K2// endif *//* enddefine */
    /* define pv *//* if !(obj value) //short// elif obj value //V2// endif *//* enddefine */

    /* define gk *//* if !(obj key) //Character// elif obj key //K2// endif *//* enddefine */
    /* define gv *//* if !(obj value) //Short// elif obj value //V2// endif *//* enddefine */

    /* if obj key */
    <KE> HashCharShortMapFactory<KE/* if obj value */, V/* endif */>
    withKeyEquivalence(@Nullable Equivalence<KE> keyEquivalence);
    /* endif */

    /* if obj value */
    @Override
    <VE> HashCharShortMapFactory</* if obj key */K, /* endif */VE>
    withValueEquivalence(@Nullable Equivalence<VE> valueEquivalence);

    /* elif !(obj value) */
    @Override
    HashCharShortMapFactory/*<>*/ withDefaultValue(short defaultValue);
    /* endif */

    /* with Mutable|Updatable|Immutable mutability */
    /* if !(Immutable mutability) */
    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMap();

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMap(int expectedSize);
    /* endif */

    /* with with|without expectedSize */
    /* define arg *//* if with expectedSize //, int expectedSize// endif *//* enddefine */

    /* if obj key || without expectedSize */
    /* if with expectedSize *//**
     * If the specified map has the same key equivalence with this factory,
     * {@code expectedSize} is ignored.
     *//* endif */
    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMap(Map/*ep*/<Character, Short>/**/ map/*arg*/);
    /* endif */

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMap(Map/*ep*/<Character, Short>/**/ map1,
            Map/*ep*/<Character, Short>/**/ map2/*arg*/);

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMap(Map/*ep*/<Character, Short>/**/ map1,
            Map/*ep*/<Character, Short>/**/ map2, Map/*ep*/<Character, Short>/**/ map3/*arg*/);

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMap(Map/*ep*/<Character, Short>/**/ map1,
            Map/*ep*/<Character, Short>/**/ map2, Map/*ep*/<Character, Short>/**/ map3,
            Map/*ep*/<Character, Short>/**/ map4/*arg*/);

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMap(Map/*ep*/<Character, Short>/**/ map1,
            Map/*ep*/<Character, Short>/**/ map2, Map/*ep*/<Character, Short>/**/ map3,
            Map/*ep*/<Character, Short>/**/ map4, Map/*ep*/<Character, Short>/**/ map5/*arg*/);

    /* endwith */

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMap(
            net.openhft.function.Consumer</*f*/CharShortConsumer/*p2*/> entriesSupplier);

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMap(
            net.openhft.function.Consumer</*f*/CharShortConsumer/*p2*/> entriesSupplier,
            int expectedSize);

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMap(/*pk*/char/**/[] keys, /*pv*/short/**/[] values);

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMap(/*pk*/char/**/[] keys, /*pv*/short/**/[] values,
            int expectedSize);

    /* if !(obj key obj value) */
    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMap(
            /*gk*/Character/**/[] keys, /*gv*/Short/**/[] values);

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMap(
            /*gk*/Character/**/[] keys, /*gv*/Short/**/[] values, int expectedSize);
    /* endif */

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMap(Iterable</*ek*/Character/**/> keys,
            Iterable</*ev*/Short/**/> values);

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMap(Iterable</*ek*/Character/**/> keys,
            Iterable</*ev*/Short/**/> values, int expectedSize);


    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMapOf(/*pk*/char/**/ k1, /*pv*/short/**/ v1);

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMapOf(/*pk*/char/**/ k1, /*pv*/short/**/ v1,
            /*pk*/char/**/ k2, /*pv*/short/**/ v2);

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMapOf(/*pk*/char/**/ k1, /*pv*/short/**/ v1,
            /*pk*/char/**/ k2, /*pv*/short/**/ v2, /*pk*/char/**/ k3, /*pv*/short/**/ v3);

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMapOf(/*pk*/char/**/ k1, /*pv*/short/**/ v1,
            /*pk*/char/**/ k2, /*pv*/short/**/ v2, /*pk*/char/**/ k3, /*pv*/short/**/ v3,
            /*pk*/char/**/ k4, /*pv*/short/**/ v4);

    @Override
    /*p1*/ HashCharShortMap/*p2*/ newMutableMapOf(/*pk*/char/**/ k1, /*pv*/short/**/ v1,
            /*pk*/char/**/ k2, /*pv*/short/**/ v2, /*pk*/char/**/ k3, /*pv*/short/**/ v3,
            /*pk*/char/**/ k4, /*pv*/short/**/ v4, /*pk*/char/**/ k5, /*pv*/short/**/ v5);
    /* endwith */
}
