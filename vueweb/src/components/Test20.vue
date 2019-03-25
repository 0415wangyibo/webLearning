<template>
  <div id="test20">
    <p>原始字符串: {{ message }}</p>
    <p>计算后反转字符串: {{ reversedMessage }}</p>
    <p>使用方法后反转字符串: {{ reversedMessage2() }}</p>
  </div>
</template>

<script>
    export default {
      data(){
        return {
          message: 'Runoob!'
        }
      },
      computed: {
        // 计算属性的 getter
        reversedMessage: function () {
          // `this` 指向 vm 实例
          return this.message.split('').reverse().join('')
        }
      },
      methods: {
        reversedMessage2: function () {
          return this.message.split('').reverse().join('')
        }
      }
    }
</script>

<style scoped>

</style>
