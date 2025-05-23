    public class QueueLinkedList {
        NodeMahasiswa17 head;
        int capacity;
        int slot;

        QueueLinkedList(int capacity) {
        this.capacity = capacity;
        slot = capacity;
        }

        boolean isEmpty () {
            return head == null;
        }

        void print() {
            if (!isEmpty()) {
            NodeMahasiswa17 tmp = head;
            System.out.println("Isi linked list");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked list kosong");
        }

        }

        void addQueue(Mahasiswa17 input) {
            if (isEmpty()) {
                NodeMahasiswa17 newQueue = new NodeMahasiswa17(input, null);
                head = newQueue; 
            } else {
                NodeMahasiswa17 newQueue = new NodeMahasiswa17(input, null);
                NodeMahasiswa17 tmp = head;
                while (tmp.next != null) {
                    tmp = tmp.next;
                }
                tmp.next = newQueue;
            }
            slot--;
        }

        Mahasiswa17 getQueue() {
            if (isEmpty()) {
                System.out.println("Antrian kosong");
                return null;
            } else {
                NodeMahasiswa17 mhs = head;
                head = head.next;
                slot++;
                return mhs.data;
            }
        }

        boolean isFull () {
            return slot == 0;
        } 

        void clearQueue() {
            head = null;
        }

        int countMhs() {
            return capacity - slot;
        }

        Mahasiswa17 firstQueue() {
            return head.data;
        }

        Mahasiswa17 lastQueue() {
            NodeMahasiswa17 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }

            return tmp.data;
        }

    }