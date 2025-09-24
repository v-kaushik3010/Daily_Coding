// Last updated: 9/24/2025, 10:33:28 AM
let sortedListToBST = function (head) {
    let curr = head, count = 0;

    while (curr) curr = curr.next, count++;

    const treeify = (i, j) => {
        if (j < i) return null;
        let mid = i + j >> 1, node = new TreeNode();
        node.left = treeify(i, mid - 1);
        node.val = curr.val, curr = curr.next;
        node.right = treeify(mid + 1, j);
        return node;
    }

    curr = head;
    return treeify(1, count);
}