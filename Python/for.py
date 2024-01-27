fruits = ['사과','망고','귤','포도']


for fruit in fruits:
    print(fruit)

ages = [5, 15, 20, 16, 22, 12]

for age in ages:
    #조건 나이 20살 이상
    if age > 20:
        print(f'{age}살 성인')
    else:
        print(f'{age}살 청소년')