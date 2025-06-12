public class BinaryTree17 {
    Node17 root;

    public BinaryTree17() {
        root = null;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void addRekursif(Mahasiswa17 mhs) {
        root = addRekursif(root, new Node17(mhs));
    }

    public Node17 addRekursif(Node17 current, Node17 newNode) {
        if (current == null) {
            return newNode;
        }

        String nimBaru = newNode.mahasiswa.nim;
        String nimNow  = current.mahasiswa.nim;

        if (nimBaru.compareTo(nimNow) < 0) {
            current.left = addRekursif(current.left, newNode);
        } else if (nimBaru.compareTo(nimNow) > 0) {
            current.right = addRekursif(current.right, newNode);
        } else {
            System.out.println("Penambahan gagal: NIM \"" + nimBaru + "\" sudah ada.");
        }

        return current; 
    }

    public void add(Mahasiswa17 mahasiswa){
        Node17 newNode = new Node17(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node17 current = root;
            Node17 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                        current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                        current = current.right;
                        if (current == null) {
                            parent.right = newNode;
                            return;
                        }
                    }
            }
        }
    }
    
    public Mahasiswa17 cariMinIPK() {
        if (root == null) {
            System.out.println("Tree kosong.");
            return null;
        }
        return cariMin(root).mahasiswa;
    }

    public Node17 cariMin(Node17 node) {
        if (node == null) return null;

        Node17 minNode = node;
        Node17 leftMin = cariMin(node.left);
        Node17 rightMin = cariMin(node.right);

        if (leftMin != null && leftMin.mahasiswa.ipk < minNode.mahasiswa.ipk) {
            minNode = leftMin;
        }
        if (rightMin != null && rightMin.mahasiswa.ipk < minNode.mahasiswa.ipk) {
            minNode = rightMin;
        }

        return minNode;
    }

    public Mahasiswa17 cariMaxIPK() {
        if (root == null) {
            System.out.println("Tree kosong.");
            return null;
        }
        return cariMax(root).mahasiswa;
    }

    public Node17 cariMax(Node17 node) {
        if (node == null) return null;

        Node17 maxNode = node;
        Node17 leftMax = cariMax(node.left);
        Node17 rightMax = cariMax(node.right);

        if (leftMax != null && leftMax.mahasiswa.ipk > maxNode.mahasiswa.ipk) {
            maxNode = leftMax;
        }
        if (rightMax != null && rightMax.mahasiswa.ipk > maxNode.mahasiswa.ipk) {
            maxNode = rightMax;
        }

        return maxNode;
    }

    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        if (root == null) {
            System.out.println("Tree kosong.");
            return;
        }
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilRekursif(root, ipkBatas);
    }

    public void tampilRekursif(Node17 node, double ipkBatas) {
        if (node == null) {
            return;
        }

        // Inorder traversal
        tampilRekursif(node.left, ipkBatas);

        if (node.mahasiswa.ipk > ipkBatas) {
            Mahasiswa17 mhs = node.mahasiswa;
            System.out.println("NIM  : " + mhs.nim);
            System.out.println("Nama : " + mhs.nama);
            System.out.println("Kelas: " + mhs.kelas);
            System.out.println("IPK  : " + mhs.ipk);
            System.out.println("----------------------");
        }

        tampilRekursif(node.right, ipkBatas);
    }



    boolean find(double ipk){
        boolean result = false;
        Node17 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if(ipk > current.mahasiswa.ipk){
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    void traversePreorder(Node17 node){
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreorder(node.left);
            traversePreorder(node.right);
        }
    }

    void traverseInorder(Node17 node){
        if (node != null) {
            traverseInorder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInorder(node.right);
        }
    }

    void traversePostorder(Node17 node){
        if (node != null) {
            traversePostorder(node.left);
            traversePostorder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    Node17 getSuccessor(Node17 del){
        Node17 successor = null;
        Node17 successorParent = null;

        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }

        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(double ipk){
        if (isEmpty()) {
            System.out.println("Binary tree kosong.");
        }
        Node17 parent = root;
        Node17 current = root;
        boolean isLeftChild = false;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if(ipk < current.mahasiswa.ipk){
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if(ipk > current.mahasiswa.ipk){
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
            if (current == null) {
                System.out.println("Data tidak ditemukan.");
                return;
            } else {
                if (current.left == null && current.right == null) {
                    if (current == root) {
                        root = null;
                    }else {
                        if (isLeftChild) {
                            parent.left = null;
                        } else {
                            parent.right = null;
                        }
                    }
                }else if (current.left == null) {
                    if (current == root) {
                        root = current.right;
                    } else {
                        if (isLeftChild) {
                            parent.left = current.right;
                        } else {
                            parent.right = current.right;
                        }
                    }
                }else {
                    Node17 successor = getSuccessor(current);
                    System.out.println("Jika 2 anak, current = ");
                    successor.mahasiswa.tampilInformasi();
                    if (current == root) {
                        root = successor;
                    } else {
                        if (isLeftChild) {
                            parent.left = successor;
                        } else {
                            parent.right = successor;
                        }
                    }
                    successor.left = current.left;
                }
            }
        }
    }
}
