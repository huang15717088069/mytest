var vue = new Vue({
    el:"#app",
    data:{
        userList:[],
        user:{}
    },
	methods:{
        findAll:function(){
            // _this是vue对象
            var _this = this;
            // 查询所有（使用ajax）
            axios.get("./user/findAll").then(function(response){
                // console.log(response);
                // 注意：在axios中使用的this不再是vue对象了，所有不能使用this完成赋值
                // vue.userList = response.data;
                // 或者
                _this.userList = response.data;
            }).catch(function(err){

            })
        },
        findOne: function (id) {

            axios.get("./user/findOne/"+id).then(function(response){
                //console.log(response.data);
                vue.user = response.data;
            }).catch(function(err){

            })
        },
        update:function () {
            axios.post("./user/update",this.user).then(function(response){
                alert("更新数据成功！！");
                vue.findAll(); // 更新完成之后，完成一个查询
            }).catch(function(err){
                alert("更新数据失败！！")
            })
        }
    },
    created:function(){
        this.findAll();
    }
})