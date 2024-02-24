list1 = [1,2,3,4,5]
list2 = ['a','b','c','d','e','f']

mergeList = list()
n1 = len(list1)
n2 = len(list2)

i = 0
j = 0
index = 0
while(i < n1 and j < n2):
    if(index % 2 == 0):
        mergeList.append(list1[i])
        i += 1
    else:
        mergeList.append(list2[j])
        j += 1
    index+=1
        
while(i < n1):
    mergeList.append(list1[i])
    i += 1

while(j < n2):
    mergeList.append(list2[j])
    j += 1
    
print(mergeList)