# CaffeinRPG-Status

Configから自由にステータスパラメータの追加・削除が行えます。






以下Dev用使い方
class import
1. ステータスを持たせたいclassにCaffeinStatusをインポート
2. CaffeinStatusContainerを作る -> CaffeinStatus.create();
3. getCaffeinStatusContainer()を@Overrideしてreturnを[2]で作ったCaffeinStatusContainerにする
interface extend
1. そのままextendしてOKです
※例 -> https://github.com/CaffeinRPG-server/CaffeinRPG-Status/blob/main/src/main/java/Example/ExampleOfCaffeinStatus.java
