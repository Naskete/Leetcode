struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

ListNode* rotateRight(ListNode* head, int k) {
    if(!head || !head->next) return head;
    ListNode* tail=head, *cur = head;
    int len = 1;
    while(tail->next){
        tail=tail->next;
        len++;
    };
    k=len-k%len;
    if(k==len) return head;
    while(k-->1){
        cur=cur->next;
    }
    tail->next=head;
    head=cur->next;
    cur->next=tail->next;
    return head;
}