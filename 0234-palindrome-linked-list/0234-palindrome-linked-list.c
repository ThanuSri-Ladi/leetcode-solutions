/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head) {
    struct ListNode*temp=head;
    int a[1000000];
     int num=0;
    while(temp!=NULL){
   
    a[num++]=temp->val;
    temp=temp->next;
    }
    int i=0;
    int j=num-1;
    while(i<j){
    if(a[i]!=a[j])
      return 0;
      i++;
      j--; 
    }
return 1;
}