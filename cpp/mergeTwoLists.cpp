#include <iostream>

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
    if(!l1) return l2;
    if(!l2) return l1;
    ListNode* head = new ListNode();
    ListNode* r = head;
    ListNode* p = l1, *q=l2;
    while(p&&q){
        if(p->val <= q->val){
            r->next = p;
            r=p;
                p=p->next;
        } else {
            r->next = q;
            r=q;
            q=q->next;
        }
    }
    r->next=p?p:q;
    return head->next;
}