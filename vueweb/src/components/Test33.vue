<template>
  <div id="test33">
    <!-- `greet` 是在下面定义的方法名 -->
    <button v-on:click="greet">Greet</button>
    <p v-on:click="greet">Greet</p>
  </div>
</template>

<script>
    export default {
      data(){
        return{
          name: 'Vue.js'
        }
      },
      // 在 `methods` 对象中定义方法
      methods: {
        greet: function (event) {
          // `this` 在方法里指当前 Vue 实例
          alert('Hello ' + this.name + '!');
          // `event` 是原生 DOM 事件
          if (event) {
            alert(event.target.tagName);
          }
        }
      }
    }
</script>

<style scoped>

</style>
