struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

ListNode* removeNthFromEnd(ListNode* head, int n) {
    int len = 1;
    ListNode *p = head;
    while(p->next){
        p=p->next;
        len++;
    }
    len = len -n;
    if(!len){ 
        // 删除第一个结点
        head=head->next;
        return head;
    }
    p = head;
    while(--len){
        p=p->next;
    }
    p->next=p->next->next;
    return head;
}