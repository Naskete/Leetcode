#include <iostream>

struct ListNode{
    int val;
    ListNode* next;
    ListNode(int x): val(x), next(NULL){}
};

ListNode* removeElements(ListNode* head, int val) {
    if(head==NULL) return head;
    while(head&&head->val==val){
        head=head->next;
    }
    if(!head||!(head->next)) return head;
    ListNode* p = head;
    while(p&&p->next){
        if(p->next->val == val){
            p->next=p->next->next;
        } else{
            p=p->next;
        }
        if(!p) break;
    }
    return head;
}