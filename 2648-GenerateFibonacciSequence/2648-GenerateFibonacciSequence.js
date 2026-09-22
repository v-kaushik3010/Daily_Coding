// Last updated: 9/22/2026, 2:46:30 PM
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