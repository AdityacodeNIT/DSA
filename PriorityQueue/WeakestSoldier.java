    import java.util.PriorityQueue;

    public class WeakestSoldier {
        // the comparable implements fucntion is working here 
        static class Row implements Comparable<Row> {
            
            int Soldier;
            int idx;
            

            public Row(int Soldier, int idx) {
                this.Soldier = Soldier;
                this.idx = idx;
            }

            @Override
            public int compareTo(Row r2) {
    // if Soldier is same then it would check the index or else it would just check the the Soldier number in each row.
                if (this.Soldier == r2.Soldier) {
                    return this.idx - r2.idx;
                } else {
                    return this.Soldier - r2.Soldier;
                }
            }
        }

        public static void main(String[] args) {
            // Here we have defined the rows;
            int rows[][] = { { 1, 0, 0, 0 }, { 1, 1, 1, 1 }, { 1, 0, 0, 0 }, { 1, 0, 0, 0 } };
            int k = 2;

            PriorityQueue<Row> pq = new PriorityQueue<>();

            for (int i = 0; i < rows.length; i++) {
                int count = 0;
                // this count is here to count the number of soliders in one row and adding them in pq accordingly
                for (int j = 0; j < rows[0].length; j++) {
                    // here we are checking if there is a soldier or not using the logical terneary operator;
                    count += rows[i][j] == 1 ? 1 : 0;
                }
                // here we are adding the code into the pq;
                pq.add(new Row(count, i));

                /* As we know the characterstics of the priority queue the least value will come as
               the first element and the max value will come as the last element so the row with the 
                weakest soldier will be the first element of the priority queue with its index using the class property */ 
            }
            for (int i = 0; i < k; i++) {
                System.out.println("R " + pq.remove().idx);
            }

        }
    }
