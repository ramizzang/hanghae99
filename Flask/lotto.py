
def count_common_elements(list1, list2):
    common_elements = set(list1) & set(list2)
    return len(common_elements)

# 예제 리스트
list1 = [1, 2, 3, 4, 5]
list2 = [3, 4, 5, 6, 7]

# 두 리스트에서 같은 요소의 개수 확인
common_count = count_common_elements(list1, list2)

print(f"두 리스트에서 같은 요소의 개수: {common_count}")
