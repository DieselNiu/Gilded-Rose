# 镶金玫瑰注意点

1. 查找idea能找到的最基本的小缺陷
2. 判断字符串相等有重复的逻辑 --------提炼函数解决
3. 发现上一步提炼的函数中有两个点，违反了迪米特法则 ---------把整个函数进行搬移 f5 || 旧的不变，新的创建 一步切换 旧的再见  再用inline
4. 把updateQuality改名字为passOneDay，对for循环里面的逻辑进行提炼函数passOneDay，搬移Item中。sellIn<0表明已经过期，isExpired updatSellInDays updateQualityAfterExpired  updateQuality
5. 交换语句时有副作用的，但是测试竟然没有问题，所以在怀疑可能出错的地方加入测试
6. 每次创建一个Item的时候都要传入同样的字符串，我希望在创建Item时不要手打字符串----写几个工厂方法解决创建问题
7. 创建子类，使得Item类中的逻辑下沉，此时工厂方法已经没啥用，可以inline回去
8. if/else 改造成卫语句，记得加return。 
