package leetcode.algorithms.medium;

import java.util.PriorityQueue;

// 1845. Seat Reservation Manager
public class SeatReservationManager {

    private PriorityQueue<Integer> pq = new PriorityQueue<>();

    public SeatReservationManager(int n) {
        for (int i = 1; i <= n; i++) {
            pq.offer(i);
        }
    }

    public int reserve() {
        return pq.poll();
    }

    public void unreserve(int seatNumber) {
        pq.offer(seatNumber);
    }
}
