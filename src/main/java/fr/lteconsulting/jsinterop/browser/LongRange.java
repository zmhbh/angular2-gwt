package fr.lteconsulting.jsinterop.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * base type: LongRange
  * flags: 32768
  * declared in: apis/browser-api/tsd/lib.es6.d.ts:259973
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="LongRange")
public class LongRange
{

    /*
        Properties
    */

    public Number max;

    @JsProperty( name = "max")
    public native Number getMax();

    @JsProperty( name = "max")
    public native void setMax( Number value );

    public Number min;

    @JsProperty( name = "min")
    public native Number getMin();

    @JsProperty( name = "min")
    public native void setMin( Number value );
}