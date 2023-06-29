# Algorithms.py
# This program contains useful stuff

import random

def Shuffle(list):
    rand = 0
    lastIndex = len(list) -1 

    while lastIndex > 1:
        rand = random.randint(0, lastIndex)

    return list


print(Shuffle([1,2,3,4,5,6]))