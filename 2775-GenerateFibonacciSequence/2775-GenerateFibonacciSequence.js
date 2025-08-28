// Last updated: 8/28/2025, 12:39:48 PM
/**
 * @return {Generator<number>}
 */
var fibGenerator = function*() {
    let a = 0;
    let b = 1;
    yield a;
    yield b;
    while(true){
        const next = a+b;
        yield next;
        a = b;
        b = next;
    }
};

/**
 * const gen = fibGenerator();
 * gen.next().value; // 0
 * gen.next().value; // 1
 */