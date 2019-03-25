<template>
  <div id = "test22">
    <p style = "font-size:25px;">计数器: {{ counter }}</p>
    <button @click = "counter++" style = "font-size:25px;">点我</button>
  </div>
</template>

<script>
    export default {
      data(){
        return{
          counter: 1
        }
      },
      watch:{
        counter:function (nval, oval) {
          alert('计数器值的变化 :' + oval + ' 变为 ' + nval + '!');
        }
      }
    }
</script>

<style scoped>

</style>
