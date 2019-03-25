<template>
  <div id="test18">
    <ul>
      <li v-for="(value, key, index) in object">
        {{ index }}. {{ key }} : {{ value }}
      </li>
    </ul>
  </div>
</template>

<script>
    export default {
      data() {
        return{
          object: {
            name: '菜鸟教程',
            url: 'http://www.runoob.com',
            slogan: '学的不仅是技术，更是梦想！'
          }
        }
      }
    }
</script>

<style scoped>
  #test18{
    text-align: left;
  }
</style>
