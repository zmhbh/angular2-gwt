package fr.lteconsulting.jsinterop;

import fr.lteconsulting.jsinterop.browser.ArrayLike;
import fr.lteconsulting.jsinterop.browser.PromiseLike;
import fr.lteconsulting.jsinterop.rxjs.Subscribable;
import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfFunction1OfObjectAndRAndArrayLikeOfObjectAndPromiseLikeOfObjectAndSubscribableOfObject<R>  {
    @JsOverlay
    default Function1<Object, R> asFunction1OfObjectAndR() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <R> UnionOfFunction1OfObjectAndRAndArrayLikeOfObjectAndPromiseLikeOfObjectAndSubscribableOfObject<R> ofFunction1OfObjectAndR(Function1<Object, R> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ArrayLike<Object> asArrayLikeOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <R> UnionOfFunction1OfObjectAndRAndArrayLikeOfObjectAndPromiseLikeOfObjectAndSubscribableOfObject<R> ofArrayLikeOfObject(ArrayLike<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default PromiseLike<Object> asPromiseLikeOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <R> UnionOfFunction1OfObjectAndRAndArrayLikeOfObjectAndPromiseLikeOfObjectAndSubscribableOfObject<R> ofPromiseLikeOfObject(PromiseLike<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Subscribable<Object> asSubscribableOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <R> UnionOfFunction1OfObjectAndRAndArrayLikeOfObjectAndPromiseLikeOfObjectAndSubscribableOfObject<R> ofSubscribableOfObject(Subscribable<Object> value) {
        return Js.cast( value );
    }
    
}