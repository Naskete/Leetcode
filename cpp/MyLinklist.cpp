#include<iostream>
using namespace std;

// 索引0-index
class MyLinkedList {
public:
    MyLinkedList(){
        size = 0;
        head = new Node();
    }

    // get(index)：获取链表中第 index 个节点的值。如果索引无效，则返回-1。
    int get(int index){
        if(index < 0 || index >= size) return -1;
        // index 0 - (size-1)
        Node* p = head->next; // 0
        while(index--){
            p=p->next;
        }
        return p->val;
    }

    // addAtHead(val)：在链表的第一个元素之前添加一个值为 val 的节点。插入后，新节点将成为链表的第一个节点。
    void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    // addAtTail(val)：将值为 val 的节点追加到链表的最后一个元素。 
    void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    // addAtIndex(index,val)：在链表中的第 index 个节点之前添加值为 val  的节点。如果 index 等于链表的长度，则该节点将附加到链表的末尾。如果 index 大于链表长度，则不会插入节点。如果index小于0，则在头部插入节点。
    void addAtIndex(int index, int val) {
        if(index > size) return;
        if(index < 0) index = 0;
        Node* p = head;
        while(index--){
            p=p->next;
        }
        Node* node = new Node(val);
        node->next = p->next;
        p->next = node;
        size++;
    }
    
    // deleteAtIndex(index)：如果索引 index 有效，则删除链表中的第 index 个节点。
    void deleteAtIndex(int index) {
        if(index < 0 || index >= size) return;
        Node* p = head;
        while(index--){
            p=p->next;
        }
        p->next = p->next->next;
        size--;
    }

    void show(){
        Node* p = head->next;
        while(p){
            cout<<p->val<<"\t";
            p=p->next;
        }
        cout<<endl;
    }
    
    int getSize(){
        return size;
    }

    ~MyLinkedList(){
        size=0;
        head=nullptr;
    }

private:
    struct Node{
        int val;
        Node* next;
        Node():val(0), next(NULL){}
        Node(int x):val(x), next(NULL){}
        Node(int x, Node* next): val(x), next(next){}
    };
    int size;
    Node* head;
};

int main(){
    MyLinkedList* link = new MyLinkedList();
    for(int i = 5; i > 0; i--){
        link->addAtHead(i);
    }
    link->addAtTail(12);
    link->show();
    cout<<"0: "<<link->get(0)<<endl;
    cout<<"6: "<<link->get(6)<<endl;
    cout<<"5: "<<link->get(5)<<endl;
    link->deleteAtIndex(-3);
    link->deleteAtIndex(0);
    link->show();
    link->deleteAtIndex(6);
    link->deleteAtIndex(4);
    link->show();
}
