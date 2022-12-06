#include <iostream>

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

ListNode* oddEvenList(ListNode* head) {
    if(head==NULL || head->next==NULL) return head;
    ListNode* p = head, *q = head->next, *even=head->next;
    while(q->next&&p->next){
        p->next = q->next;
        p=p->next;
        if(!p->next) break;
        q->next=p->next;
        q=q->next;
    }
    q->next = NULL;
    p->next = even;
    return head;
}