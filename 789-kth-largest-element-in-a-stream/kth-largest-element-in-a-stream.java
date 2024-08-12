import java.util.PriorityQueue;

// Class to find the kth largest element in a stream of numbers
class KthLargest {

    // Priority queue to maintain the smallest 'k' elements seen so far
    private PriorityQueue<Integer> minHeap;

    // The kth position we are interested in for the largest element
    private int k;

    /**
     * Constructor to initialize the data structure and populate with initial elements.
     *
     * @param k    The kth position to track in the list of largest elements.
     * @param nums An array of initial numbers to be added to the kth largest tracker.
     */
    public KthLargest(int k, int[] nums) {
        // Initialize a min-heap with the capacity to hold 'k' elements
        this.minHeap = new PriorityQueue<>(k);
        this.k = k;

        // Add the initial elements to the kth largest tracker
        for (int num : nums) {
            add(num);
        }
    }

    /**
     * Adds a new number into the stream and returns the kth largest element.
     *
     * @param val The new number to be added to the stream.
     * @return The kth largest element after adding the new number.
     */
    public int add(int val) {
        // Always add the new value to the min-heap
        minHeap.offer(val);

        // If the size of the min-heap exceeds 'k', remove the smallest element
        if (minHeap.size() > k) {
            minHeap.poll();
        }

        // The root of the min-heap represents the kth largest element
        return minHeap.peek();
    }
}


/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */