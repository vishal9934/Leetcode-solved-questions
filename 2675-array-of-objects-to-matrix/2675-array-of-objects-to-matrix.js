var jsonToMatrix = function(arr) {
  const map = new Map();
  const n = arr.length;

  for (let i = 0; i < n; ++i) {
    const el = arr[i];

    processElement(el, "", i);
  }

  const ans = new Array(n + 1);

  const sortedKeys = [...map.keys()].sort();

  for (let i = 0; i <= n; ++i) {
    ans[i] = new Array(map.size);

    for (let j = 0; j < map.size; ++j) {
      ans[i][j] = i === 0 ? sortedKeys[j] : map.get(sortedKeys[j])[i - 1];
    }
  }

  return ans;

  function processElement(element, path, idx) {
    if (typeof element !== "object" || element === null) {
      if (!map.has(path)) map.set(path, new Array(n).fill(""));
      map.get(path)[idx] = element;
      return;
    }

    if (Array.isArray(element)) {
      const arrLen = element.length;

      for (let i = 0; i < arrLen; ++i) {
        processElement(element[i], `${path}${path !== "" ? "." : ""}${i}`, idx);
      }
    } else {
      for (const key of Object.keys(element)) {
        processElement(element[key], `${path}${path !== "" ? "." : ""}${key}`, idx);
      }
    }
  }
};