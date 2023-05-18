var TimeLimitedCache = function() {
    this.cache = new Map();
};

/** 
 * @param {number} key
 * @param {number} value
 * @param {number} time until expiration in ms
 * @return {boolean} if un-expired key already existed
 */
TimeLimitedCache.prototype.set = function(key, value, duration) {
    
    const hasKey = this.cache.has(key);

    if (hasKey) {
      
      const [, oldRef] = this.cache.get(key);
      clearTimeout(oldRef);

    }

    const ref = setTimeout(() => {
      this.cache.delete(key);
    }, duration);

    this.cache.set(key, [value, ref]);

    return hasKey;
};

/** 
 * @param {number} key
 * @return {number} value associated with key
 */
TimeLimitedCache.prototype.get = function(key) {
    if (!this.cache.has(key)) {
      return -1;
    }

    const [value, ] = this.cache.get(key);

    return value;
};

/** 
 * @return {number} count of non-expired keys
 */
TimeLimitedCache.prototype.count = function() {
    return this.cache.size;
};