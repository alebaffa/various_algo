public class HeapAPI {

	// to be initialized
	Node[] heap = null;
	int N = 0;

	public int getSize() {
		return N;
	}

	// compare parent Node i, with children Node j
	public boolean less(int i, int j) {
		return (heap[i].val < heap[j].val);
	}

	// Exchange parent Node i, with child Node j.
	// heap[i] < heap[j]
	public void exchange(int i, int j) {
		Node tmp = heap[i];
		heap[i] = heap[j];
		heap[j] = tmp;
	}

	// check if the Node in position k is greater than parent
	// Hint: in a heap, the parent is always at position k/2,
	// and the children are in positions k*2 (left), and k*2+1 (right)
	public void swim(int k) {
		// check if the child node is less than its parent
		while (k > 1 && less(k / 2, k)) {
			// in this case exchange the child with the parent node.
			exchange(k / 2, k);
			// and put the cursor to the parent so it will be checked with its
			// parent as well.
			k = k / 2;
		}
	}

	public void sink(int k) {
		while (k * 2 <= heap.length) {
			int j = k * 2;
			// check left child.
			if (j < heap.length && less(j, j + 1))
				j++;
			// check right child.
			if (!less(k, j))
				break; // OK. Parent node must be greater than child.
			exchange(k, j); // otherwise exchange parent with child.
			k = j; // move to the child, and check again.
		}
	}

	public void insert(Node k) {
		heap[N] = k; // add Node in the end of the heap
		swim(N); // check if this node breaks the order of the heap.
	}
}
