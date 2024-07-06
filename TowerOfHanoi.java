public class TowerOfHanoi {

    // Recursive method to solve Tower of Hanoi puzzle
    public static void solveHanoi(int n, char fromRod, char toRod, char auxRod) {
        // Base case: if there's only one disk, move it from 'fromRod' to 'toRod'
        if (n == 1) {
            System.out.println("Move disk 1 from rod " + fromRod + " to rod " + toRod);
            return;
        }

        // Move the top n-1 disks from 'fromRod' to 'auxRod' using 'toRod' as the auxiliary rod
        solveHanoi(n - 1, fromRod, auxRod, toRod);

        // Move the remaining disk from 'fromRod' to 'toRod'
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);

        // Move the n-1 disks from 'auxRod' to 'toRod' using 'fromRod' as the auxiliary rod
        solveHanoi(n - 1, auxRod, toRod, fromRod);
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks

        // Let's solve the Tower of Hanoi problem for 3 disks
        System.out.println("Solving Tower of Hanoi for " + n + " disks:");
        solveHanoi(n, 'A', 'C', 'B');  // A, B, and C are names of the rods
    }
}
