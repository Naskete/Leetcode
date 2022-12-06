#include<iostream>
using namespace std;

struct ListNode{
    int val;
    ListNode* next;
    ListNode(int x): val(x), next(NULL){}
};

ListNode *detectCycle(ListNode *head) {
    ListNode* front = head, *back = head;
    while(front&&front->next){
        if(!front->next->next){
            return NULL;
        }
        front=front->next->next;
        back=back->next;
        if(front==back) break;
    }
    if(front==NULL||front->next==NULL) return NULL;
    front = head;
    while(front!=back){
        front=front->next;
        back=back->next;
    }
    return front;
}