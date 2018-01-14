package lista;

public class Main {

    public static void main(String[] args) {

        Node firstNode = new Node(8);
        Node secondNode = new Node(3);
        Node thirdNode = new Node(11);

        firstNode.setNext(secondNode);
        secondNode.setNext(thirdNode);


        printNodes(firstNode);

    }

    public static void printNodes(Node node) {

        Node tmpNode = node;
        while (tmpNode != null){
            System.out.println(tmpNode.getValue());
            tmpNode = tmpNode.getNext();
        }

    }
}
