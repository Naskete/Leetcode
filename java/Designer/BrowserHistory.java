package Designer;

class BrowserHistory {
    class Node {
        String url;
        Node pre;
        Node next;
        public Node(String url) {
            this.url = url;
        }
    }

    private Node history;
    private Node cur;
    public BrowserHistory(String homepage) {
        history = new Node(homepage);
        history.next = null;
        history.pre = null;
        this.cur = history;
    }
    
    public void visit(String url) {
        Node node = new Node(url);
        node.pre = cur;
        cur.next = node;
        node.next = null;
        cur = node;
    }
    
    public String back(int steps) {
        while (steps > 0) {
            steps--;
            if (cur.pre == null) {
                return cur.url;
            }
            cur = cur.pre;
        }
        return cur.url;
    }
    
    public String forward(int steps) {
        while (steps > 0) {
            steps--;
            if (cur.next == null) {
                return cur.url;
            }
            cur = cur.next;
        }
        return cur.url;
    }
}